package com.fragilecoder.interfaceinjava;

import android.widget.Button;

public class Boxer implements Fighting{
Button btn_Love;
Button btn_ife;
    Button btn_ifemi;
    @Override
    public String throwJab() {
        return "Throw Faster Jab";
    }

    @Override
    public String throwCross() {
        return "Throw Faster Cross";
    }

    @Override
    public String throwHook() {
        return "Throw Faster Hook";
    }
}
