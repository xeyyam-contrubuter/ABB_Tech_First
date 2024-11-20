package az.abbtech.homework_4.task_2;

class Counter {
    static int instanceCount = 0;

    Counter(){
        instanceCount++;
    }

    static void showCount(){
        System.out.println("Count is: " + instanceCount);
    }
}
