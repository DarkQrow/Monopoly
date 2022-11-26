package com.CawCawStudio.Log;

import android.content.Context;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LogSaver {
    private static LogSaver instance;
    private static Context context;
    private LogSaver(Context context){ this.context = context;}

    public static LogSaver getInstance(Context context){
        if(instance == null){
            instance = new LogSaver(context);
        }
        return instance;
    }
    public void debug(String tag,String message){
        Log.d(tag,message);
        writeToFile(tag,message);
    }
    public void error(String tag,String message){
        Log.e(tag,message);
        writeToFile(tag,message);
    }

    private void writeToFile(String tag, String message){
        File logFile = new File(context.getFilesDir(),"log.file");
        if (!logFile.exists())
        {
            try
            {
                logFile.createNewFile();
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        try
        {
            //BufferedWriter for performance, true to set append to file flag
            BufferedWriter buf = new BufferedWriter(new FileWriter(logFile, true));
            buf.append(tag+": "+message);
            buf.newLine();
            buf.close();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

