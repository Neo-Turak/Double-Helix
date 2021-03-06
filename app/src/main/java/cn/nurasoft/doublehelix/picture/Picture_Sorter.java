/*
 * Copyright (c) 2018.
 * Developed by Turak Nurahmat
 * Under the guide of  the University of Hertfordshire, Master of Computer Science final project team.
 * SID:15066679
 * License: Apache 2.0
 * All rights reserved!
 */

package cn.nurasoft.doublehelix.picture;

/**
 * created by Nurahmat
 * 16/8/2017
 */

import android.util.Log;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Picture_Sorter {


    private final File dir = new File("/data/data/cn.nurasoft.doublehelix/image/");
    public List<String> list = new ArrayList<>();
    private List<String> temp = new ArrayList<>();
    private File[] file;


    public void Sorted_Data() {

        StringBuilder builder = new StringBuilder();

        file = dir.listFiles();

        try {

            for (File f : file) {
                if (f.isFile()) {
                    builder.append(f.getName()).append(" ");
                }
            }
            for (File f : file) {
                if (f.getName().contains("jpg")) {
                    temp.add(f.getName());
                }
            }
        } catch (NullPointerException e) {
            Log.e("NullPointException:", e.getMessage());
        }
    }

    public void Sort() {
        for (String s : temp) {
            String tmp1 = s.substring(0, 4) + "-" + s.substring(4, 6) + "-" + s.substring(6, 8);
            String tmp2 = s.substring(8, 10) + ":" + s.substring(10, 12) + ":" + s.substring(12, 14);
            String tmp3 = tmp1 + " " + tmp2;
            list.add(tmp3);
        }
    }
}
