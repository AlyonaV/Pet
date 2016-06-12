package mvc.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("")
public class TrackerController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void listAllUsers() {
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
    public void listAllUsersGET(@RequestParam String id, @RequestParam String timestamp,
                                @RequestParam String lat, @RequestParam String lon,
                                @RequestParam String speed, @RequestParam String bearing,
                                @RequestParam String altitude, @RequestParam String batt) {
        System.out.println(id);
        System.out.println(timestamp);
        System.out.println(lat);
        System.out.println(lon);
        System.out.println(speed);
        System.out.println(bearing);
        System.out.println(altitude);
        System.out.println(batt);
        System.out.println("msseGET");
    }

}
