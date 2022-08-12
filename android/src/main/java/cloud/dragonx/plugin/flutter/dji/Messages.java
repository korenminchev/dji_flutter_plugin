// Autogenerated from Pigeon (v3.1.6), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package cloud.dragonx.plugin.flutter.dji;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class Messages {

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class Version {
    private @Nullable String string;
    public @Nullable String getString() { return string; }
    public void setString(@Nullable String setterArg) {
      this.string = setterArg;
    }

    public static final class Builder {
      private @Nullable String string;
      public @NonNull Builder setString(@Nullable String setterArg) {
        this.string = setterArg;
        return this;
      }
      public @NonNull Version build() {
        Version pigeonReturn = new Version();
        pigeonReturn.setString(string);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("string", string);
      return toMapResult;
    }
    static @NonNull Version fromMap(@NonNull Map<String, Object> map) {
      Version pigeonResult = new Version();
      Object string = map.get("string");
      pigeonResult.setString((String)string);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class Battery {
    private @Nullable Long level;
    public @Nullable Long getLevel() { return level; }
    public void setLevel(@Nullable Long setterArg) {
      this.level = setterArg;
    }

    public static final class Builder {
      private @Nullable Long level;
      public @NonNull Builder setLevel(@Nullable Long setterArg) {
        this.level = setterArg;
        return this;
      }
      public @NonNull Battery build() {
        Battery pigeonReturn = new Battery();
        pigeonReturn.setLevel(level);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("level", level);
      return toMapResult;
    }
    static @NonNull Battery fromMap(@NonNull Map<String, Object> map) {
      Battery pigeonResult = new Battery();
      Object level = map.get("level");
      pigeonResult.setLevel((level == null) ? null : ((level instanceof Integer) ? (Integer)level : (Long)level));
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class Drone {
    private @Nullable String status;
    public @Nullable String getStatus() { return status; }
    public void setStatus(@Nullable String setterArg) {
      this.status = setterArg;
    }

    private @Nullable Double batteryPercent;
    public @Nullable Double getBatteryPercent() { return batteryPercent; }
    public void setBatteryPercent(@Nullable Double setterArg) {
      this.batteryPercent = setterArg;
    }

    private @Nullable Double altitude;
    public @Nullable Double getAltitude() { return altitude; }
    public void setAltitude(@Nullable Double setterArg) {
      this.altitude = setterArg;
    }

    private @Nullable Double latitude;
    public @Nullable Double getLatitude() { return latitude; }
    public void setLatitude(@Nullable Double setterArg) {
      this.latitude = setterArg;
    }

    private @Nullable Double longitude;
    public @Nullable Double getLongitude() { return longitude; }
    public void setLongitude(@Nullable Double setterArg) {
      this.longitude = setterArg;
    }

    private @Nullable Double speed;
    public @Nullable Double getSpeed() { return speed; }
    public void setSpeed(@Nullable Double setterArg) {
      this.speed = setterArg;
    }

    private @Nullable Double roll;
    public @Nullable Double getRoll() { return roll; }
    public void setRoll(@Nullable Double setterArg) {
      this.roll = setterArg;
    }

    private @Nullable Double pitch;
    public @Nullable Double getPitch() { return pitch; }
    public void setPitch(@Nullable Double setterArg) {
      this.pitch = setterArg;
    }

    private @Nullable Double yaw;
    public @Nullable Double getYaw() { return yaw; }
    public void setYaw(@Nullable Double setterArg) {
      this.yaw = setterArg;
    }

    public static final class Builder {
      private @Nullable String status;
      public @NonNull Builder setStatus(@Nullable String setterArg) {
        this.status = setterArg;
        return this;
      }
      private @Nullable Double batteryPercent;
      public @NonNull Builder setBatteryPercent(@Nullable Double setterArg) {
        this.batteryPercent = setterArg;
        return this;
      }
      private @Nullable Double altitude;
      public @NonNull Builder setAltitude(@Nullable Double setterArg) {
        this.altitude = setterArg;
        return this;
      }
      private @Nullable Double latitude;
      public @NonNull Builder setLatitude(@Nullable Double setterArg) {
        this.latitude = setterArg;
        return this;
      }
      private @Nullable Double longitude;
      public @NonNull Builder setLongitude(@Nullable Double setterArg) {
        this.longitude = setterArg;
        return this;
      }
      private @Nullable Double speed;
      public @NonNull Builder setSpeed(@Nullable Double setterArg) {
        this.speed = setterArg;
        return this;
      }
      private @Nullable Double roll;
      public @NonNull Builder setRoll(@Nullable Double setterArg) {
        this.roll = setterArg;
        return this;
      }
      private @Nullable Double pitch;
      public @NonNull Builder setPitch(@Nullable Double setterArg) {
        this.pitch = setterArg;
        return this;
      }
      private @Nullable Double yaw;
      public @NonNull Builder setYaw(@Nullable Double setterArg) {
        this.yaw = setterArg;
        return this;
      }
      public @NonNull Drone build() {
        Drone pigeonReturn = new Drone();
        pigeonReturn.setStatus(status);
        pigeonReturn.setBatteryPercent(batteryPercent);
        pigeonReturn.setAltitude(altitude);
        pigeonReturn.setLatitude(latitude);
        pigeonReturn.setLongitude(longitude);
        pigeonReturn.setSpeed(speed);
        pigeonReturn.setRoll(roll);
        pigeonReturn.setPitch(pitch);
        pigeonReturn.setYaw(yaw);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("status", status);
      toMapResult.put("batteryPercent", batteryPercent);
      toMapResult.put("altitude", altitude);
      toMapResult.put("latitude", latitude);
      toMapResult.put("longitude", longitude);
      toMapResult.put("speed", speed);
      toMapResult.put("roll", roll);
      toMapResult.put("pitch", pitch);
      toMapResult.put("yaw", yaw);
      return toMapResult;
    }
    static @NonNull Drone fromMap(@NonNull Map<String, Object> map) {
      Drone pigeonResult = new Drone();
      Object status = map.get("status");
      pigeonResult.setStatus((String)status);
      Object batteryPercent = map.get("batteryPercent");
      pigeonResult.setBatteryPercent((Double)batteryPercent);
      Object altitude = map.get("altitude");
      pigeonResult.setAltitude((Double)altitude);
      Object latitude = map.get("latitude");
      pigeonResult.setLatitude((Double)latitude);
      Object longitude = map.get("longitude");
      pigeonResult.setLongitude((Double)longitude);
      Object speed = map.get("speed");
      pigeonResult.setSpeed((Double)speed);
      Object roll = map.get("roll");
      pigeonResult.setRoll((Double)roll);
      Object pitch = map.get("pitch");
      pigeonResult.setPitch((Double)pitch);
      Object yaw = map.get("yaw");
      pigeonResult.setYaw((Double)yaw);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class Media {
    private @Nullable String fileName;
    public @Nullable String getFileName() { return fileName; }
    public void setFileName(@Nullable String setterArg) {
      this.fileName = setterArg;
    }

    private @Nullable String fileUrl;
    public @Nullable String getFileUrl() { return fileUrl; }
    public void setFileUrl(@Nullable String setterArg) {
      this.fileUrl = setterArg;
    }

    private @Nullable Long fileIndex;
    public @Nullable Long getFileIndex() { return fileIndex; }
    public void setFileIndex(@Nullable Long setterArg) {
      this.fileIndex = setterArg;
    }

    public static final class Builder {
      private @Nullable String fileName;
      public @NonNull Builder setFileName(@Nullable String setterArg) {
        this.fileName = setterArg;
        return this;
      }
      private @Nullable String fileUrl;
      public @NonNull Builder setFileUrl(@Nullable String setterArg) {
        this.fileUrl = setterArg;
        return this;
      }
      private @Nullable Long fileIndex;
      public @NonNull Builder setFileIndex(@Nullable Long setterArg) {
        this.fileIndex = setterArg;
        return this;
      }
      public @NonNull Media build() {
        Media pigeonReturn = new Media();
        pigeonReturn.setFileName(fileName);
        pigeonReturn.setFileUrl(fileUrl);
        pigeonReturn.setFileIndex(fileIndex);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("fileName", fileName);
      toMapResult.put("fileUrl", fileUrl);
      toMapResult.put("fileIndex", fileIndex);
      return toMapResult;
    }
    static @NonNull Media fromMap(@NonNull Map<String, Object> map) {
      Media pigeonResult = new Media();
      Object fileName = map.get("fileName");
      pigeonResult.setFileName((String)fileName);
      Object fileUrl = map.get("fileUrl");
      pigeonResult.setFileUrl((String)fileUrl);
      Object fileIndex = map.get("fileIndex");
      pigeonResult.setFileIndex((fileIndex == null) ? null : ((fileIndex instanceof Integer) ? (Integer)fileIndex : (Long)fileIndex));
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class Stream {
    private @Nullable byte[] data;
    public @Nullable byte[] getData() { return data; }
    public void setData(@Nullable byte[] setterArg) {
      this.data = setterArg;
    }

    public static final class Builder {
      private @Nullable byte[] data;
      public @NonNull Builder setData(@Nullable byte[] setterArg) {
        this.data = setterArg;
        return this;
      }
      public @NonNull Stream build() {
        Stream pigeonReturn = new Stream();
        pigeonReturn.setData(data);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("data", data);
      return toMapResult;
    }
    static @NonNull Stream fromMap(@NonNull Map<String, Object> map) {
      Stream pigeonResult = new Stream();
      Object data = map.get("data");
      pigeonResult.setData((byte[])data);
      return pigeonResult;
    }
  }
  private static class DjiHostApiCodec extends StandardMessageCodec {
    public static final DjiHostApiCodec INSTANCE = new DjiHostApiCodec();
    private DjiHostApiCodec() {}
    @Override
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return Battery.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)129:         
          return Media.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)130:         
          return Version.fromMap((Map<String, Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value)     {
      if (value instanceof Battery) {
        stream.write(128);
        writeValue(stream, ((Battery) value).toMap());
      } else 
      if (value instanceof Media) {
        stream.write(129);
        writeValue(stream, ((Media) value).toMap());
      } else 
      if (value instanceof Version) {
        stream.write(130);
        writeValue(stream, ((Version) value).toMap());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface DjiHostApi {
    @NonNull Version getPlatformVersion();
    @NonNull Battery getBatteryLevel();
    void registerApp();
    void connectDrone();
    void disconnectDrone();
    void delegateDrone();
    void takeOff();
    void land();
    void start(@NonNull String flightJson);
    void virtualStick(@NonNull Boolean enabled, @NonNull Double pitch, @NonNull Double roll, @NonNull Double yaw, @NonNull Double verticalThrottle);
    @NonNull List<Media> getMediaList();
    @NonNull String downloadMedia(@NonNull Long fileIndex);
    @NonNull Boolean deleteMedia(@NonNull Long fileIndex);
    void videoFeedStart();
    void videoFeedStop();

    /** The codec used by DjiHostApi. */
    static MessageCodec<Object> getCodec() {
      return DjiHostApiCodec.INSTANCE;
    }

    /** Sets up an instance of `DjiHostApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, DjiHostApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiHostApi.getPlatformVersion", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Version output = api.getPlatformVersion();
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiHostApi.getBatteryLevel", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Battery output = api.getBatteryLevel();
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiHostApi.registerApp", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.registerApp();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiHostApi.connectDrone", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.connectDrone();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiHostApi.disconnectDrone", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.disconnectDrone();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiHostApi.delegateDrone", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.delegateDrone();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiHostApi.takeOff", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.takeOff();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiHostApi.land", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.land();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiHostApi.start", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              String flightJsonArg = (String)args.get(0);
              if (flightJsonArg == null) {
                throw new NullPointerException("flightJsonArg unexpectedly null.");
              }
              api.start(flightJsonArg);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiHostApi.virtualStick", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Boolean enabledArg = (Boolean)args.get(0);
              if (enabledArg == null) {
                throw new NullPointerException("enabledArg unexpectedly null.");
              }
              Double pitchArg = (Double)args.get(1);
              if (pitchArg == null) {
                throw new NullPointerException("pitchArg unexpectedly null.");
              }
              Double rollArg = (Double)args.get(2);
              if (rollArg == null) {
                throw new NullPointerException("rollArg unexpectedly null.");
              }
              Double yawArg = (Double)args.get(3);
              if (yawArg == null) {
                throw new NullPointerException("yawArg unexpectedly null.");
              }
              Double verticalThrottleArg = (Double)args.get(4);
              if (verticalThrottleArg == null) {
                throw new NullPointerException("verticalThrottleArg unexpectedly null.");
              }
              api.virtualStick(enabledArg, pitchArg, rollArg, yawArg, verticalThrottleArg);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiHostApi.getMediaList", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              List<Media> output = api.getMediaList();
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiHostApi.downloadMedia", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number fileIndexArg = (Number)args.get(0);
              if (fileIndexArg == null) {
                throw new NullPointerException("fileIndexArg unexpectedly null.");
              }
              String output = api.downloadMedia((fileIndexArg == null) ? null : fileIndexArg.longValue());
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiHostApi.deleteMedia", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number fileIndexArg = (Number)args.get(0);
              if (fileIndexArg == null) {
                throw new NullPointerException("fileIndexArg unexpectedly null.");
              }
              Boolean output = api.deleteMedia((fileIndexArg == null) ? null : fileIndexArg.longValue());
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiHostApi.videoFeedStart", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.videoFeedStart();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiHostApi.videoFeedStop", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.videoFeedStop();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static class DjiFlutterApiCodec extends StandardMessageCodec {
    public static final DjiFlutterApiCodec INSTANCE = new DjiFlutterApiCodec();
    private DjiFlutterApiCodec() {}
    @Override
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return Drone.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)129:         
          return Stream.fromMap((Map<String, Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value)     {
      if (value instanceof Drone) {
        stream.write(128);
        writeValue(stream, ((Drone) value).toMap());
      } else 
      if (value instanceof Stream) {
        stream.write(129);
        writeValue(stream, ((Stream) value).toMap());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated class from Pigeon that represents Flutter messages that can be called from Java.*/
  public static class DjiFlutterApi {
    private final BinaryMessenger binaryMessenger;
    public DjiFlutterApi(BinaryMessenger argBinaryMessenger){
      this.binaryMessenger = argBinaryMessenger;
    }
    public interface Reply<T> {
      void reply(T reply);
    }
    static MessageCodec<Object> getCodec() {
      return DjiFlutterApiCodec.INSTANCE;
    }

    public void setStatus(@NonNull Drone droneArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiFlutterApi.setStatus", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(droneArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void sendVideo(@NonNull Stream streamArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.DjiFlutterApi.sendVideo", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(streamArg)), channelReply -> {
        callback.reply(null);
      });
    }
  }
  private static Map<String, Object> wrapError(Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorMap;
  }
}
