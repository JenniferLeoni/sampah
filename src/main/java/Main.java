
import Engine.*;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.awt.geom.Point2D;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;

public class Main {
    private Window window =
            new Window
                    (700,700,"Hello World");
    private ArrayList<Object2d> objects
            = new ArrayList<>();
    private ArrayList<Object2d> liness
            = new ArrayList<>();
//    private ArrayList<Vector3f> points = new ArrayList<>();
    private ArrayList<Object2d> objectsSquare = new ArrayList<>();
    public void init(){
        window.init();
        GL.createCapabilities();

        //code
        liness.add(new Object2d(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f,0.0f,0.0f,0.0f)
        ));

    }

    public void input(){
//        if (window.isKeyPressed(GLFW_KEY_W)){
//            System.out.println("W");
//        }
        if (window.getMouseInput().isLeftButtonPressed()){
            Vector2f pos = window.getMouseInput().getCurrentPos();

            pos.x = (pos.x - (window.getWidth()/2.0f)) / (window.getWidth()/2.0f);
            pos.y = (pos.y - (window.getHeight()/2.0f)) / (-window.getHeight()/2.0f);
            if((!(pos.x > 1 || pos.x < -0.97) && !(pos.y > 0.97 || pos.y < -1))){
                List<Vector3f> points = liness.get(0).getVertices();
                boolean find = true;
                int index = 0;
                for(Vector3f point: points){
                    if ((Point2D.distance(pos.x, pos.y, point.x, point.y) < 0.055f)){
                        find = false;
                        break;
                    }
                    index += 1;
                }
                if (!find){
                    objectsSquare.get(index).setCenter(pos.x, pos.y);
                    objectsSquare.get(index).createRectangle();
                    objectsSquare.get(index).setupVAOVBO();
                    List<Vector3f> temp = liness.get(0).getVertices();
                    temp.set(index, new Vector3f(pos.x, pos.y, 0));
                    liness.get(0).setVertices(temp);
                    liness.get(0).setupVAOVBO();

                    return;
                }
                liness.get(0).addVertices(new Vector3f(pos.x, pos.y, 0.0f));
                objectsSquare.add(new RectangleWithCircleFormula(
                        Arrays.asList(
                                //shaderFile lokasi menyesuaikan objectnya
                                new ShaderProgram.ShaderModuleData
                                        ("resources/shaders/scene.vert"
                                                , GL_VERTEX_SHADER),
                                new ShaderProgram.ShaderModuleData
                                        ("resources/shaders/scene.frag"
                                                , GL_FRAGMENT_SHADER)
                        ),
                        new ArrayList<>(),
                        new Vector3f(pos.x, pos.y, 0.0f),
                        new Vector3f(0.05f, 0.05f, 0),
                        new Vector4f(1.0f,0.0f,0.0f,0.0f)
                ));
            }
        }



    }
    public void loop(){
        while (window.isOpen()) {
            window.update();
            glClearColor(0.6f,
                    0.65f,1.0f,0.0f);
            GL.createCapabilities();
            input();

            //code
            for(Object2d object: liness){
                object.drawLine();
            }
            for(Object2d object: objects){
                object.drawWithVerticesColor();
            }
            for(Object2d object: objectsSquare){
                object.draw();
            }



            // Restore state
            glDisableVertexAttribArray(0);

            // Poll for window events.
            // The key callback above will only be
            // invoked during this call.
            glfwPollEvents();
        }
    }
    public void run() {

        init();
        loop();

        // Terminate GLFW and
        // free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }
    public static void main(String[] args) {
        new Main().run();
    }
}