package mvc.protocol;

import mvc.util.Checksum;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 * Created by Alona on 25.05.2016.
 */
public class GT06ProtocolEncoder {

    private String encodeContent(String content) {

        StringBuilder buf = new StringBuilder();

        buf.append(0x78);
        buf.append(0x78);

        buf.append(1 + 1 + 4 + content.length() + 2 + 2); // message length

        buf.append(0x80); // message type

        buf.append(4 + content.length()); // command length
        buf.append(0);
        buf.append(content.getBytes(Charset.defaultCharset())); // command

        buf.append(0); // message index

        byte[] byteArr = buf.toString().getBytes();
        byte[] newByteArr = new byte[byteArr.length-2];
        System.arraycopy(byteArr, 0, newByteArr, 0, byteArr.length-2);

        ByteBuffer bf = ByteBuffer.wrap(newByteArr);

        buf.append(Checksum.crc16(Checksum.CRC16_X25, bf));

        buf.append('\r');
        buf.append('\n');

        return buf.toString();
    }

//    @Override
//    protected Object encodeCommand(Command command) {
//
//        switch (command.getType()) {
//            case Command.TYPE_ENGINE_STOP:
//                return encodeContent("Relay,1#");
//            case Command.TYPE_ENGINE_RESUME:
//                return encodeContent("Relay,0#");
//            default:
//                Log.warning(new UnsupportedOperationException(command.getType()));
//                break;
//        }
//
//        return null;
//    }
}
