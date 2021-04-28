package parozzz.github.com.simpleplcpanel.runtime;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import parozzz.github.com.hmi.comm.modbustcp.ModbusTCPThread;
import parozzz.github.com.hmi.comm.siemens.SiemensPLCThread;
import parozzz.github.com.hmi.serialize.data.JSONDataMap;
import parozzz.github.com.hmi.util.FXUtil;
import parozzz.github.com.logger.MainLogger;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public final class JavaFXMain extends Application
{

    @Override
    public void start(Stage stage)
    {

    }

    @Override
    public void stop()
    {

    }

}
