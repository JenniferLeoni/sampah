package Engine;

import org.joml.Vector3f;
import org.joml.Vector4f;

import java.util.Arrays;
import java.util.List;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL15.GL_STATIC_DRAW;
import static org.lwjgl.opengl.GL20.glEnableVertexAttribArray;
import static org.lwjgl.opengl.GL20.glVertexAttribPointer;

public class StarWithCircleFormulaIG extends Object2d {
    float x, y;
    Vector3f centerpoint;
    Vector3f radius;

    public StarWithCircleFormulaIG(List<ShaderModuleData> shaderModuleDataList
            , List<Vector3f> vertices, Vector3f centerpoint, Vector3f radius, Vector4f color) {
        super(shaderModuleDataList, vertices, color);
        this.centerpoint = centerpoint;
        this.radius = radius;
        createStar();
        setupVAOVBO();
    }

    public void createStar() {
        vertices.clear();
        for (double i = 18; i < 600; i += 144) {
            x = (float) (centerpoint.x + radius.x * Math.cos(Math.toRadians(i)));
            y = (float) (centerpoint.y + radius.y * Math.sin(Math.toRadians(i)));
            vertices.add(new Vector3f(x, y, 0.0f));
        }
    }

    public void draw() {
        drawSetup();
        glLineWidth(2); //ketebalan garis
        glPointSize(10); //besar kecil vertex
        glDrawArrays(GL_LINE_LOOP,
                0,
                vertices.size());
    }
}