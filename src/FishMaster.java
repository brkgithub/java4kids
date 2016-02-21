/**
 * Created by brkothari on 2/19/16.
 */
public class FishMaster {

    public static void main(String[] args) {
        Fish myFish = new Fish();

        myFish.dive(2);
        myFish.dive(97);
        myFish.dive(3);

        myFish.sleep();


        String fishReaction;
        fishReaction = myFish.talk("Hello");
        System.out.println(fishReaction);

    }


}
