
public class Main {
    public static void main(String[] args) {
        //Created a new instance of the Gym class.
        FitnessGym gym = new FitnessGym(false);
        //Created an array of all the actions that can be performed on the Gym from the Actions enum.
        Actions [] actions = Actions.values();
        //Created and array of a single action to verify that no action is performed on the gym when it is closed.
        Actions [] actions2 = {Actions.SHOW_PERSONS};
        //Created an array of all the actions that can be performed on the Gym from the Actions enum in different order.
        Actions [] actions3 = {Actions.OPEN_GYM, Actions.ADD_TRAINER, Actions.ADD_SUBSCRIBER, Actions.ADD_SUBSCRIBER,
                Actions.ADD_SUBSCRIBER,Actions.SHOW_PERSONS, Actions.SHOW_COACHES,
                Actions.SHOW_MAX_LEVEL, Actions.REMOVE_PERSON,Actions.REMOVE_PERSON,Actions.SHOW_PERSONS, Actions.CLOSE_GYM};

//        //Created a for loop to go through the array "actions".
//        for (Actions action : actions) {
//            gym.performAction(action);
//        }
//
//        //Created a for loop to go through the array "actions2" and verify that no action is performed on the gym when it is closed.
//        if (gym.open) {
//            for (Actions action : actions2) {
//                gym.performAction(action);
//            }
//        } else {
//            throw new ExceptionGymClosed("The Gym is closed!");
//        }

        //Created a for loop to go through the array "actions3" in a different order.
        for (Actions action : actions3) {
            gym.performAction(action);
        }
    }
}
