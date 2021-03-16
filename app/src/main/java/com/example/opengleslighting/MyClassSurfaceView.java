package com.example.opengleslighting;

import android.content.Context;
import android.opengl.GLSurfaceView;

//Опишем наш класс MyClassSurfaceView расширяющий GLSurfaceView
public class MyClassSurfaceView extends GLSurfaceView{
    //создадим ссылку для хранения экземпляра нашего класса рендерера
    private MyClassRenderer renderer;

    // конструктор
    public MyClassSurfaceView(Context context) {
        super(context);
        setEGLContextClientVersion(2);
        renderer = new MyClassRenderer(context);
        setRenderer(renderer);
        setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);

    }
}
