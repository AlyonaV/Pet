package mvc.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TrackerController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void listAllUsers(@RequestBody String gotMessage) {
        System.out.println("mssePOST");
//        Logger.getLogger(getClass().getName()).log(Level.INFO,
//                "MSG from device:{0}", gotMessage);
//        TK103Protocol protocol = new TK103Protocol();
//
//        try {
//            Tk103SentenceDTO tk103SentenceDTO = protocol.ParseSentence(gotMessage);
//            System.out.println(tk103SentenceDTO.toString());
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public void listAllUsersGET(@RequestBody String gotMessage) {
        System.out.println("msseGET");
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public void listAllUsersPUT(@RequestBody String gotMessage) {
        System.out.println("mssePUT");
    }
    @RequestMapping(value = "", method = RequestMethod.HEAD)
    public void listAllUsersHEAD(@RequestBody String gotMessage) {
        System.out.println("msseGET");
    }

}
