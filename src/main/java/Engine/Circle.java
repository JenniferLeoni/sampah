package Engine;

import org.joml.Vector3f;
import org.joml.Vector4f;

import java.util.List;

import static org.lwjgl.opengl.GL11.*;

public class Circle extends Object2d {

    float x, y;
    Vector3f centerpoint;
    Vector3f radius;

    public Circle(List<ShaderModuleData> shaderModuleDataList
            , List<Vector3f> vertices, Vector3f centerpoint, Vector3f radius, Vector4f color) {
        super(shaderModuleDataList, vertices, color);
        this.centerpoint = centerpoint;
        this.radius = radius;
        createCircle();
        setupVAOVBO();
    }

    public void createCircle() {
        vertices.clear();
        for (double i = 0; i < 360; i += 0.01f) {
            x = (float) (centerpoint.x + radius.x * Math.cos(Math.toRadians(i)));
            y = (float) (centerpoint.y + radius.y * Math.sin(Math.toRadians(i)));
            vertices.add(new Vector3f(x, y, 0.0f));
        }
    }

    public void draw() {
        drawSetup();
        glLineWidth(10); //ketebalan garis
        glPointSize(10); //besar kecil vertex
        glDrawArrays(GL_TRIANGLE_FAN,
                0,
                vertices.size());
    }
}