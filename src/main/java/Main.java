
import Engine.*;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

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
    private ArrayList<Object2d> objectsRectangle
            = new ArrayList<>();
    private ArrayList<Object2d> objectsCircle
            = new ArrayList<>();
    private ArrayList<Object2d> objectsPointsControl = new ArrayList<>();
    public void init(){
        window.init();
        GL.createCapabilities();

        //code
        objectsRectangle.add(new Rectangle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(-1.0f,-1.0f,0.0f),
                                new Vector3f(-1.0f,-0.3f,0.0f),
                                new Vector3f(1.0f,-1.0f,0.0f),
                                new Vector3f( 1.0f,-0.3f,0.0f)
                        )
                ),
                new Vector4f(0.55f,0.8f,0.6f,0.0f),
                Arrays.asList(0,1,2,1,2,3)

        ));
        objectsRectangle.add(new Rectangle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.05f,-0.4f,0.0f),
                                new Vector3f(0.05f,0.25f,0.0f),
                                new Vector3f(0.75f,-0.4f,0.0f),
                                new Vector3f( 0.75f,0.25f,0.0f)
                        )
                ),
                new Vector4f(1.0f,0.8f,0.55f,0.0f),
                Arrays.asList(0,1,2,1,2,3)

        ));
        objectsRectangle.add(new Object2d(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(-0.214f,0.66f,0.0f),
                                new Vector3f(-0.5f,0.2f,0.0f),
                                new Vector3f(0.05f,0.2f,0.0f)
                        )
                ), new Vector4f(0.85f,0.55f,0.3f,0.0f)
        ));
        objectsRectangle.add(new Rectangle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(-0.4f,-0.4f,0.0f),
                                new Vector3f(-0.4f,0.25f,0.0f),
                                new Vector3f(0.05f,-0.4f,0.0f),
                                new Vector3f( 0.05f,0.25f,0.0f)
                        )
                ),
                new Vector4f(1.0f,0.85f,0.6f,0.0f),
                Arrays.asList(0,1,2,1,2,3)

        ));

        objectsRectangle.add(new Object2d(
            Arrays.asList(
                //shaderFile lokasi menyesuaikan objectnya
                new ShaderProgram.ShaderModuleData
                        ("resources/shaders/scene.vert"
                                , GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData
                        ("resources/shaders/scene.frag"
                                , GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(-0.175f,0.6f,0.0f),
                                new Vector3f(-0.4f,0.25f,0.0f),
                                new Vector3f(0.05f,0.25f,0.0f)
                        )
                ), new Vector4f(1.0f,0.85f,0.6f,0.0f)
        ));
        objectsRectangle.add(new Rectangle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(-0.214f,0.66f,0.0f),
                                new Vector3f(0.548f,0.66f,0.0f),
                                new Vector3f(0.05f,0.2f,0.0f),
                                new Vector3f( 0.83f,0.2f,0.0f)
                        )
                ),
                new Vector4f(0.95f,0.65f,0.4f,0.0f),
                Arrays.asList(0,1,2,1,2,3)

        ));

        objectsRectangle.add(new Rectangle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.4f,0.55f,0.0f),
                                new Vector3f(0.4f,0.7f,0.0f),
                                new Vector3f(0.52f,0.55f,0.0f),
                                new Vector3f( 0.52f,0.7f,0.0f)
                        )
                ),
                new Vector4f(0.9f,0.7f,0.6f,0.0f),
                Arrays.asList(0,1,2,1,2,3)

        ));

        objectsRectangle.add(new Rectangle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.38f,0.7f,0.0f),
                                new Vector3f(0.38f,0.74f,0.0f),
                                new Vector3f(0.54f,0.7f,0.0f),
                                new Vector3f( 0.54f,0.74f,0.0f)
                        )
                ),
                new Vector4f(0.8f,0.6f,0.5f,0.0f),
                Arrays.asList(0,1,2,1,2,3)

        ));

        objectsRectangle.add(new Rectangle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(-0.3f,-0.4f,0.0f),
                                new Vector3f(-0.3f,0.05f,0.0f),
                                new Vector3f(-0.05f,-0.4f,0.0f),
                                new Vector3f( -0.05f,0.05f,0.0f)
                        )
                ),
                new Vector4f(0.8f,0.6f,0.5f,0.0f),
                Arrays.asList(0,1,2,1,2,3)

        ));

        objectsCircle.add(new Circle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.0f,0.5f,0.0f),
                                new Vector3f(-0.55f,-0.25f,0.0f),
                                new Vector3f(0.5f,-0.5f,0.0f)
                        )
                ),
                new Vector3f(0.5f, 0.8f, 0.0f),
                new Vector3f(0.06f, 0.028f, 0.0f),
                new Vector4f(0.95f,0.95f,0.95f,1.0f)

        ));

        objectsCircle.add(new Circle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.0f,0.5f,0.0f),
                                new Vector3f(-0.55f,-0.25f,0.0f),
                                new Vector3f(0.5f,-0.5f,0.0f)
                        )
                ),
                new Vector3f(0.6f, 0.85f, 0.0f),
                new Vector3f(0.09f, 0.055f, 0.0f),
                new Vector4f(0.95f,0.95f,0.95f,1.0f)

        ));
        objectsCircle.add(new Circle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.0f,0.5f,0.0f),
                                new Vector3f(-0.55f,-0.25f,0.0f),
                                new Vector3f(0.5f,-0.5f,0.0f)
                        )
                ),
                new Vector3f(0.8f, 0.9f, 0.0f),
                new Vector3f(0.18f, 0.075f, 0.0f),
                new Vector4f(0.95f,0.95f,0.95f,1.0f)

        ));
        objectsCircle.add(new Circle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.0f,0.5f,0.0f),
                                new Vector3f(-0.55f,-0.25f,0.0f),
                                new Vector3f(0.5f,-0.5f,0.0f)
                        )
                ),
                new Vector3f(-0.78f, 0.75f, 0.0f),
                new Vector3f(0.1f, 0.1f, 0.0f),
                new Vector4f(1.0f,0.85f,0.6f,0.0f)

        ));
        objectsCircle.add(new Circle(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.0f,0.5f,0.0f),
                                new Vector3f(-0.55f,-0.25f,0.0f),
                                new Vector3f(0.5f,-0.5f,0.0f)
                        )
                ),
                new Vector3f(-0.73f, 0.75f, 0.0f),
                new Vector3f(0.07f, 0.08f, 0.0f),
                new Vector4f(0.6f, 0.65f,1.0f,0.0f)

        ));
        objectsCircle.add(new StarWithCircleFormulaIG(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.0f,0.5f,0.0f),
                                new Vector3f(-0.55f,-0.25f,0.0f),
                                new Vector3f(0.5f,-0.5f,0.0f)
                        )
                ),
                new Vector3f(-0.95f, 0.9f, 0.0f),
                new Vector3f(0.04f, 0.04f, 0.0f),
                new Vector4f(1.0f,0.85f,0.6f,0.0f)

        ));
        objectsCircle.add(new StarWithCircleFormulaIG(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.0f,0.5f,0.0f),
                                new Vector3f(-0.55f,-0.25f,0.0f),
                                new Vector3f(0.5f,-0.5f,0.0f)
                        )
                ),
                new Vector3f(-0.7f, 0.55f, 0.0f),
                new Vector3f(0.03f, 0.03f, 0.0f),
                new Vector4f(1.0f,0.85f,0.6f,0.0f)

        ));
        objectsCircle.add(new StarWithCircleFormulaIG(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(0.0f,0.5f,0.0f),
                                new Vector3f(-0.55f,-0.25f,0.0f),
                                new Vector3f(0.5f,-0.5f,0.0f)
                        )
                ),
                new Vector3f(-0.5f, 0.7f, 0.0f),
                new Vector3f(0.04f, 0.04f, 0.0f),
                new Vector4f(1.0f,0.85f,0.6f,0.0f)

        ));

        objectsPointsControl.add(new Object2d(
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
        if (window.isKeyPressed(GLFW_KEY_W)){
            System.out.println("W");
        }
        if (window.getMouseInput().isLeftButtonPressed()){
            Vector2f pos = window.getMouseInput().getCurrentPos();

            pos.x = (pos.x - (window.getWidth()/2.0f)) / (window.getWidth()/2.0f);
            pos.y = (pos.y - (window.getHeight()/2.0f)) / (-window.getHeight()/2.0f);
            if((!(pos.x > 1 || pos.x < -0.97) && !(pos.y > 0.97 || pos.y < -1))){
                System.out.println("x: " + pos.x + " y : " + pos.y);
                objectsPointsControl.get(0).addVertices(new Vector3f(pos.x, pos.y, 0));
            }
        }
        if (!find && pos.x){
            temp = new Mesh(pos, new Vector2f(0.05f, 0.05f), new Vector3f());
            temp.init();
            object.add(temp);
            temp = null;
            set_line();
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
            for(Object2d object: objects){
                object.drawWithVerticesColor();
            }
            for(Object2d object: objectsRectangle){
                object.draw();
            }
            for(Object2d object: objectsCircle){
                object.draw();
            }
            for(Object2d object: objectsPointsControl){
                object.drawLine();
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