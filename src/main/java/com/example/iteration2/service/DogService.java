package com.example.iteration2.service;


import com.example.iteration2.entity.AniEradication;
import com.example.iteration2.entity.Animal;
import com.example.iteration2.entity.Eradication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogService {
    public List<AniEradication> getInfo(){
      AniEradication ae = new AniEradication();
      Animal a = new Animal();
      //-----------------------------------------------------
      Eradication e = new Eradication();
      a.setName("Dog");
      a.setaId(1);
      //Eradication
      e.seteId(1);
      e.setName("1080 baiting");
      e.setDescription("Sodium fluoroacetate");
      e.setAdvantages("1. Flexible deployment, including vehicle, plane or helicopter.  2.Low cost. 3. Require less time. 4. Widely applied to different bit types. 5. Foxes are sensitive to the toxin. " +
              "6. Provides a relatively quick and humane death. ");
      e.setDisadvantages("1. Restricted use in peri-urban areas.2. Highly poisonous, easily harming innocent animals and pets. 3. No antidotes. 4. Slow death, having slow effect in result. 5. Baits lose toxicity expose to rain.");
      e.setType("Chemical");
      e.setImage("https://i.loli.net/2021/04/22/yrnTPkXejoKLt1i.png");
      e.setReadMore("https://pestsmart.org.au/toolkit-resource/ground-baiting-of-wild-dogs-with-1080/");
      //Ani_Eradication
      ae.setAeId(1);
      ae.setAnimal(a);
      ae.setEradication(e);
      List<AniEradication>  aeArray = new ArrayList<>();
      //ae1
      AniEradication ae1 = new AniEradication();
      ae1.setAnimal(a);
      ae1.setAeId(2);
      //------------------------------------------------------------------------

      Eradication e1 = new Eradication();
      e1.setType("Chemical");
      e1.setName("PAPP baiting");
      e1.seteId(2);
      e1.setAdvantages("1. Antidotes are provided by vets. " +
              "2. Low cost. " +
              "3. Potential use in peri-urban areas. " +
              "4. Provides a relatively quick and humane death. " +
              "5. Manufactured PAPP baits are less attractive by non-target animals. ");
      e1.setDisadvantages("1. No concentrate. " +
              "2. Ground placement only. " +
              "3. No guarantee that antidote works due to the effectiveness of PAPP. ");
      e1.setDescription("Para-aminopropiophenone");
      e1.setImage("https://i.loli.net/2021/04/22/UTGgtb8eKsyIcDM.png");
      e1.setReadMore("https://pestsmart.org.au/toolkit-resource/what-is-papp/");
      ae1.setEradication(e1);
      //ae2
      AniEradication ae2 = new AniEradication();
      ae2.setAnimal(a);
      ae2.setAeId(3);
      //------------------------------------------------------------------------

      Eradication e2 = new Eradication();
      e2.setType("Chemical");
      e2.setName("Canid Pest Ejectors");
      e2.seteId(3);
      e2.setAdvantages("1. Highly target specific. " +
              "2. Widely toxin applied. " +
              "3. Low cost. " +
              "4. Quick deployment. ");
      e2.setDisadvantages("1. Limited application environment. " +
              "2. Need certain knowledge reserve and technical abilities. ");
      e2.setDescription("A small cylindrical device consisting toxin inside a stake, hammered into soil and leaving “bait head” exposed on the surface.");
      e2.setImage("https://i.loli.net/2021/04/22/gK6apSZ2hFtCQld.png");
      e2.setReadMore("https://invasives.com.au/our-solutions/tools-products/canid-pest-ejectors-containing-1080-capsules/");
      ae2.setEradication(e2);
      aeArray.add(ae);
      aeArray.add(ae1);
      aeArray.add(ae2);
      //physical method

      AniEradication p1 = new AniEradication();
      p1.setAnimal(a);
      p1.setAeId(4);
      //------------------------------------------------------------------------

      Eradication ep = new Eradication();
      ep.setType("Physical");
      ep.setName("Soft-jawed leghold trapping");
      ep.seteId(4);
      ep.setAdvantages("1. Captured animals can be selected. " +
              "2. Available in peri-urban areas. " +
              "3. Low cost. " +
              "4. Quick deployment. ");
      ep.setDisadvantages("1. Has limited broadscale application. " +
              "2. Need certain knowledge reserve and technical abilities. " +
              "3. Low efficiency. " +
              "4. Time consuming. ");
      ep.setDescription("Applying soft-catch such as Leghold traps avoiding regulation and legislation issues. Usually the first step of catching wild dogs for later euthanasia.");
      ep.setImage("https://i.loli.net/2021/04/22/rHnUJoaLOD2C7Rd.gif");
      ep.setReadMore("https://pestsmart.org.au/toolkit-resource/trapping-of-wild-dogs-using-padded-jaw-traps/");
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
      ep1.setImage("https://i.loli.net/2021/04/22/WaFmSQXHrfzk5AM.jpg");
      ep1.setReadMore("https://pestsmart.org.au/toolkit-resource/ground-shooting-of-wild-dogs/");
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
      ep2.setReadMore("");
      p3.setEradication(ep2);
      aeArray.add(p3);

     return aeArray;
    }
}
