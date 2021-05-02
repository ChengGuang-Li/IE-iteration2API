package com.example.iteration2.service;

import com.example.iteration2.entity.AniEradication;
import com.example.iteration2.entity.Animal;
import com.example.iteration2.entity.Eradication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoatService {
    public List<AniEradication> getInfo(){
        AniEradication ae = new AniEradication();
        Animal a = new Animal();
        //------------------------------------------------------------------------

        Eradication e = new Eradication();
        a.setName("Goat");
        a.setaId(1);
        //Eradication
        e.seteId(1);
        e.setName("There is no suitable method");
        e.setDescription("Having significant risks of harming non-target animals, not permit to use in Australia");
        e.setAdvantages(" ");
        e.setDisadvantages(" ");
        e.setType("Chemical");
        //Ani_Eradication
        ae.setAeId(1);
        ae.setAnimal(a);
        ae.setEradication(e);
        List<AniEradication>  aeArray = new ArrayList<>();
        aeArray.add(ae);


        //physical method

        AniEradication p1 = new AniEradication();
        p1.setAnimal(a);
        p1.setAeId(4);
        //------------------------------------------------------------------------

        Eradication ep = new Eradication();
        ep.setType("Physical");
        ep.setName("Trapping");
        ep.seteId(4);
        ep.setAdvantages("1. Captured animals can be selected. " +
                "2. Moveable and reusable. " +
                "3. Quick deployment. ");
        ep.setDisadvantages("1. Has limited broadscale application. " +
                "2. Need certain knowledge reserve and technical abilities. " +
                "3. Labour-intensive. " +
                "4. Low efficiency. ");
        ep.setDescription("Set traps designed for capturing goat in water, usually the first step of catching wild pigs for later euthanasia.");
        ep.setImage("https://ibb.co/72mX4zr");
        ep.setReadMore("https://pestsmart.org.au/toolkit-resource/trapping-of-feral-goats/");
        p1.setEradication(ep);
        aeArray.add(p1);
        //second

        AniEradication p2 = new AniEradication();
        p2.setAnimal(a);
        p2.setAeId(5);
        //------------------------------------------------------------------------

        Eradication ep1 = new Eradication();
        ep1.setType("Physical");
        ep1.setName("Ground shooting");
        ep1.seteId(5);
        ep1.setAdvantages("1. Selective on target animals. " +
                "2. Flexible, suit for nearly every areas. " +
                "3. Low cost. ");
        ep1.setDisadvantages("1. Has limited broadscale application. " +
                "2. Need certain knowledge reserve and technical abilities. " +
                "3. Low efficiency. " +
                "4. Time consuming. " +
                "5. May alter activity patterns. ");
        ep1.setDescription("Firearms can be used by landholders, professional controller, hunting groups. But shooters need to use the weapon according to the local law and guidelines, in a safe and humane way.");
        ep1.setImage("https://i.loli.net/2021/04/22/WGP7d1mnAruwxZg.png");
        ep1.setReadMore("https://pestsmart.org.au/toolkit-resource/ground-shooting-of-feral-goats/");
        p2.setEradication(ep1);
        aeArray.add(p2);
        //third
        AniEradication p3 = new AniEradication();
        p3.setAnimal(a);
        p3.setAeId(6);
        //------------------------------------------------------------------------

        Eradication ep2 = new Eradication();
        ep2.setType("Physical");
        ep2.setName("Fencing");
        ep2.seteId(6);
        ep2.setAdvantages("1. Can achieve completely no wild dogs inside the assigned area. " +
                "2. High durability and less ongoing maintenance. 3. Low impact to non-target animals. ");

        ep2.setDisadvantages("1. Expensive. " +
                "2. Limits movements of other wildlife. " +
                "3. Have to eradicate wild dogs inside the fenced areas. 4. Not practical in large areas. " +
                "5. Have to eradicate wild pigs inside the fenced areas. ");
        ep2.setDescription("Using certain building materials excluding wild dogs from assigned areas, usually using net and electric fencing.");
        ep2.setImage("https://ibb.co/7ypJYjp");
        ep2.setReadMore("");
        p3.setEradication(ep2);
        aeArray.add(p3);
        //fourth
        AniEradication p4 = new AniEradication();
        p4.setAnimal(a);
        p4.setAeId(5);
        //------------------------------------------------------------------------

        Eradication ep3 = new Eradication();
        ep3.setType("Physical");
        ep3.setName("Aerial shooting");
        ep3.seteId(5);
        ep3.setAdvantages("1. Selective on target animals. " +
                "2. Provides a relatively quick and humane death. " +
                "3. Can applied into rugged or inaccessible terrain. ");
        ep3.setDisadvantages("1. Has limited broadscale application. " +
                "2. Need certain knowledge reserve and technical abilities. " +
                "3. Low efficiency. " +
                "4. Time consuming. " +
                "5. Low accuracy. " +
                "6. Expensive. ");
        ep3.setDescription("Shooting feral goats from a helicopter by highly skilled and experienced shooter and pilot. But shooters need to use the weapon according to the local law and guidelines, in a safe and humane way.");
        ep3.setImage("https://ibb.co/7zD10YK");
        ep3.setReadMore("https://pestsmart.org.au/toolkit-resource/aerial-shooting-of-feral-goats/");
        p4.setEradication(ep3);
        aeArray.add(p4);

        return aeArray;
    }

}
