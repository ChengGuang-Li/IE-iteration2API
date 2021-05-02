package com.example.iteration2.service;

import com.example.iteration2.entity.AniEradication;
import com.example.iteration2.entity.Animal;
import com.example.iteration2.entity.Eradication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RabbitService {

    public List<AniEradication> getInfo(){
        AniEradication ae = new AniEradication();
        Animal a = new Animal();
        //------------------------------------------------------------------------

        Eradication e = new Eradication();
        a.setName("Rabbit");
        a.setaId(3);
        //Eradication
        e.seteId(1);
        e.setName("1080 baiting");
        e.setDescription("Sodium fluoroacetate");
        e.setAdvantages("1. Flexible deployment, including vehicle, plane or helicopter.  2.Low cost. 3. Require less time. 4. Widely applied to different bit types. ");
        e.setDisadvantages("1. Restricted use in peri-urban areas.2. Highly poisonous, easily harming innocent animals and pets. 3. No antidotes. 4. Slow death, having slow effect in result. 5. Baits lose toxicity expose to rain.");
        e.setType("Chemical");
        e.setImage("https://ibb.co/ckmX0sk");
        e.setReadMore("https://pestsmart.org.au/toolkit-resource/ground-baiting-of-rabbits-with-sodium-fluoroacetate-1080/");
        //Ani_Eradication
        ae.setAeId(1);
        ae.setAnimal(a);
        ae.setEradication(e);
        List<AniEradication>  aeArray = new ArrayList<>();
        //ae1
        AniEradication ae1 = new AniEradication();
        ae1.setAnimal(a);
        ae1.setAeId(8);
        //------------------------------------------------------------------------

        Eradication e1 = new Eradication();
        e1.setType("Chemical");
        e1.setName("Pindone baiting");
        e1.seteId(4);
        e1.setAdvantages("1. Antidotes are provided. " +
                "2. Low cost. " +
                "3. Require less time. ");
        e1.setDisadvantages("1. Restricted areas for applying the baits. " +
                "2. Expensive than 1080. ");
        e1.setDescription("Pindone is an anticoagulant poison, it acts by reducing the blood clotting abilities of the rabbits.");
        e1.setImage("https://ibb.co/mRrqSWr");
        e1.setReadMore("https://pestsmart.org.au/toolkit-resource/ground-baiting-of-rabbits-with-pindone/");
        ae1.setEradication(e1);
        //ae2
        AniEradication ae2 = new AniEradication();
        ae2.setAnimal(a);
        ae2.setAeId(9);
        //------------------------------------------------------------------------

        Eradication e2 = new Eradication();
        e2.setType("Chemical");
        e2.setName("RHDV suspension");
        e2.seteId(5);
        e2.setAdvantages("1. Highly specific on target animals. " +
                "2. Can be used in urban areas. " +
                "3. Highly effective. ");
        e2.setDisadvantages("1. Need large number of rabbits for spreading. " +
                "2. Need another control method supported. " +
                "3. The use of RHDV are restricted, only authorized people can access to RHDV. " +
                "4. Cannot be used in extreme weather. " +
                "5. Cannot be used if juvenile rabbit presents. ");
        e2.setDescription("rabbit haemorrhagic disease virus): A biological control that specifically targeting on rabbits, causing rabbits experiencing “cold-like” symptoms, raising body temperature and causing rabbits to be lethargic.");
        e2.setImage("https://ibb.co/6W8Shq9");
        e2.setReadMore("https://pestsmart.org.au/toolkit-resource/bait-delivery-of-rabbit-haemorrhagic-disease-virus-rhdv1-k5-strain/");
        ae2.setEradication(e2);
        aeArray.add(ae);
        aeArray.add(ae1);
        aeArray.add(ae2);
        //physical method

        AniEradication p1 = new AniEradication();
        p1.setAnimal(a);
        p1.setAeId(10);
        //------------------------------------------------------------------------

        Eradication ep = new Eradication();
        ep.setType("Physical");
        ep.setName("Warren ripping");
        ep.seteId(6);
        ep.setAdvantages("1. Cost-effective and long-lasting control. " +
                "2. Can be done by contractors. " +
                "3. Minimal afterwards control. ");
        ep.setDisadvantages("1. Labour-intensive. " +
                "2. Expensive, high initial cost. " +
                "3. Easy to cause soil erosion and damage land. " +
                "4. Skilled operators required. ");
        ep.setDescription("Totally destroy rabbit warren by using a variety of tools including heavy machines and explosives to remove the above-surface of rabbit warren.");
        ep.setImage("https://ibb.co/3098xqZ");
        ep.setReadMore("https://pestsmart.org.au/toolkit-resource/rabbit-warren-destruction-by-ripping/");
        p1.setEradication(ep);
        aeArray.add(p1);
        //second

        AniEradication p2 = new AniEradication();
        p2.setAnimal(a);
        p2.setAeId(11);
        //------------------------------------------------------------------------

        Eradication ep1 = new Eradication();
        ep1.setType("Physical");
        ep1.setName("Soft-jawed leghold trapping:");
        ep1.seteId(7);
        ep1.setAdvantages("1. Captured animals can be selected. " +
                "2. Available in peri-urban areas. " +
                "3. Low cost. " +
                "4. Quick deployment. ");
        ep1.setDisadvantages("1. Has limited broadscale application. " +
                "2. Need certain knowledge reserve and technical abilities. " +
                "3. Low efficiency. " +
                "4. Time consuming. " +
                "6. Labour-intensive. ");
        ep1.setDescription(" Applying soft-catch such as Leghold traps avoiding regulation and legislation issues. Usually the first step of catching wild rabbits for later euthanasia.");
        ep1.setImage("https://ibb.co/fHyCsSm");
        ep1.setReadMore("https://pestsmart.org.au/toolkit-resource/trapping-of-rabbits-using-padded-jaw-traps/");
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
        ep2.setImage("https://i.loli.net/2021/04/22/2Qh3Jz9jwyOFNXx.jpg");
        ep2.setReadMore("https://pestsmart.org.au/toolkit-resource/ground-shooting-of-rabbits/");
        p3.setEradication(ep2);
        aeArray.add(p3);
        //fourth
        AniEradication p4 = new AniEradication();
        p4.setAnimal(a);
        p4.setAeId(5);
        //------------------------------------------------------------------------

        Eradication ep3 = new Eradication();
        ep3.setType("Physical");
        ep3.setName("Shooting");
        ep3.seteId(5);
        ep3.setAdvantages("1. Selective on target animals. " +
                "2. Flexible, suit for nearly every areas. " +
                "3. Low cost. " +
                "4. Provides a relatively quick and humane death. ");
        ep3.setDisadvantages("1. Has limited broadscale application. " +
                "2. Need certain knowledge reserve and technical abilities. " +
                "3. Low efficiency. " +
                "4. Time consuming. ");
        ep3.setDescription("Firearms can be used by landholders, professional controller, hunting groups. But shooters need to use the weapon according to the local law and guidelines, in a safe and humane way.");
        ep3.setImage("https://i.loli.net/2021/04/22/WGP7d1mnAruwxZg.png");
        ep3.setReadMore("http://www.rabbitfreeaustralia.com.au/rabbits/controlling-rabbits/");
        p4.setEradication(ep3);
        aeArray.add(p4);
        //fifth
        AniEradication p5 = new AniEradication();
        p5.setAnimal(a);
        p5.setAeId(12);
        //------------------------------------------------------------------------

        Eradication ep4 = new Eradication();
        ep4.setType("Physical");
        ep4.setName("Fumigating dens");
        ep4.seteId(8);
        ep4.setAdvantages("1. Provides a relatively quick and humane death. " +
                "2. Quick deployment. " +
                "3. Target-specific. " +
                "4. Can be used near urban areas. ");
        ep4.setDisadvantages("1. Low efficiency. " +
                "2. Skilled operator required. " +
                "3. Time consuming. " +
                "4. Labour-intensive. " +
                "5. Expensive. ");
        ep4.setDescription("By fumigating carbon monoxide the dens of feral rabbits, depletes the oxygen inside the dens and suffocate young rabbits cubs.");
        ep4.setImage("https://ibb.co/hyMRzR6");
        ep4.setReadMore("https://pestsmart.org.au/toolkit-resource/diffusion-fumigation-of-rabbit-warrens/");
        p5.setEradication(ep4);
        aeArray.add(p5);


        return aeArray;
    }
}
