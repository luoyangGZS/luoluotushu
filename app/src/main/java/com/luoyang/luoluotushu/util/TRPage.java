package com.luoyang.luoluotushu.util;

import java.util.List;

/**
 * package: com.luoyang.luoluotushu.util
 * created by luoyang
 * QQ:1845313665
 * on 2018/11/1
 */
public class TRPage {
    private long begin;
    private long end;
    private List<String> lines;

    public long getBegin() {
        return begin;
    }

    public void setBegin(long begin) {
        this.begin = begin;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public List<String> getLines() {
        return lines;
    }

    public String getLineToString(){
        String text ="";
        if (lines != null){
            for (String line : lines){
                text += line;
            }
        }
        return text;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }
}

