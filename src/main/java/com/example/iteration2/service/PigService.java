package com.example.iteration2.service;

import com.example.iteration2.entity.AniEradication;
import com.example.iteration2.entity.Animal;
import com.example.iteration2.entity.Eradication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PigService {


    public List<AniEradication> getInfo(){
        AniEradication ae = new AniEradication();
        Animal a = new Animal();
        //------------------------------------------------------------------------

        Eradication e = new Eradication();
        a.setName("Pig");
        a.setaId(4);
        //Eradication
        e.seteId(1);
        e.setName("1080 baiting");
        e.setDescription("Sodium fluoroacetate");
        e.setAdvantages("1. Flexible deployment, including vehicle, plane or helicopter.  2.Low cost. 3. Require less time. 4. Widely applied to different bit types. 5. Foxes are sensitive to the toxin. " +
                "6. Provides a relatively quick and humane death. ");
        e.setDisadvantages("1. Restricted use in peri-urban areas.2. Highly poisonous, easily harming innocent animals and pets. 3. No antidotes. 4. Slow death, having slow effect in result. 5. Baits lose toxicity expose to rain.");
        e.setType("Chemical");
        e.setImage("https://ibb.co/TTT8q1g");
        e.setReadMore("https://pestsmart.org.au/toolkit-resource/poisoning-of-feral-pigs-with-sodium-fluroacetate-1080/");
        //Ani_Eradication
        ae.setAeId(1);
        ae.setAnimal(a);
        ae.setEradication(e);
        List<AniEradication>  aeArray = new ArrayList<>();
        //ae1
        AniEradication ae1 = new AniEradication();
        ae1.setAnimal(a);
        ae1.setAeId(12);
        //------------------------------------------------------------------------

        Eradication e1 = new Eradication();
        e1.setType("Chemical");
        e1.setName("Sodium nitrite baiting");
        e1.seteId(2);
        e1.setAdvantages("1. Effective, can reduce large number of pigs quickly. " +
                "2. Fast acting, pigs are succumb within in 3 hours. " +
                "3. No environment residues, environmental friend. ");

        e1.setDisadvantages("1. Restricted on its use. " +
                "2. Can only use HogHopper baits. " +
                "3. Need approval and qualifications. ");
        e1.setDescription("It is an approved food preservative in low doses which kills pigs quickly.");
        e1.setImage("https://ibb.co/ZTR6KDn");
        e1.setReadMore("https://pestsmart.org.au/toolkit-resource/poisoning-of-feral-pigs-with-sodium-nitrite-hoggone/");
        ae1.setEradication(e1);

        aeArray.add(ae);
        aeArray.add(ae1);
        //physical method

        AniEradication p1 = new AniEradication();
        p1.setAnimal(a);
        p1.setAeId(13);
        //------------------------------------------------------------------------

        Eradication ep = new Eradication();
        ep.setType("Physical");
        ep.setName("Trapping");
        ep.seteId(10);
        ep.setAdvantages("1. Captured animals can be selected. " +
                "2. Moveable and reusable. " +
                "3. Quick deployment. ");
        ep.setDisadvantages("1. Has limited broadscale application. " +
                "2. Need certain knowledge reserve and technical abilities. " +
                "3. Labour-intensive. " +
                "4. Low efficiency. ");
        ep.setDescription("Erect trap designed for feral pigs including silo trap, the drop-gate trap, the panel trap and the box trap, free feeding them for attracting more feral pigs. Usually the first step of catching wild pigs for later euthanasia.");
        ep.setImage("https://ibb.co/VDsWBsY");
        ep.setReadMore("https://pestsmart.org.au/toolkits/feral-pigs/?gclid=Cj0KCQjwvYSEBhDjARIsAJMn0lhZVMPipWeL-nW8xUtgNFqKauIa3xhUf2vQJPaJ-vnB8k0gLIGFpBEaAgNHEALw_wcB");
        p1.setEradication(ep);
        aeArray.add(p1);
        //second

        AniEradication p2 = new AniEradication();
        p2.setAnimal(a);
        p2.setAeId(5);
        //------------------------------------------------------------------------

        Eradication ep1 = new Eradication();
        ep1.setType("Physical");
        ep1.setName("Shooting");
        ep1.seteId(5);
        ep1.setAdvantages("1. Selective on target animals. " +
                "2. Flexible, suit for nearly every areas. " +
                "3. Low cost. " +
                "4. Provides a relatively quick and humane death. ");
        ep1.setDisadvantages("1. Has limited broadscale application. " +
                "2. Need certain knowledge reserve and technical abilities. " +
                "3. Low efficiency. " +
                "4. Time consuming. ");
        ep1.setDescription("Firearms can be used by landholders, professional controller, hunting groups. But shooters need to use the weapon according to the local law and guidelines, in a safe and humane way.");
        ep1.setImage("https://i.loli.net/2021/04/22/WGP7d1mnAruwxZg.png");
        ep1.setReadMore("https://pestsmart.org.au/toolkit-resource/ground-shooting-of-feral-pigs/");
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
                "2. High durability and less ongoing maintenance. ");

        ep2.setDisadvantages("1. Expensive. " +
                "2. Limits movements of other wildlife. " +
                "3. Have to eradicate wild dogs inside the fenced areas. ");
        ep2.setDescription("Using certain building materials excluding wild dogs from assigned areas, usually using net and electric fencing.");
        ep2.setImage("https://ibb.co/P5S4HPz");
        ep2.setReadMore("");
        p3.setEradication(ep2);
        aeArray.add(p3);

        return aeArray;
    }
}
