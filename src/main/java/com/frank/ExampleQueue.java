package com.frank;


import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {

    public static void main(String[] args) {
  Queue<Integer> tasksStillToBeDone= new LinkedList<>();
  tasksStillToBeDone.offer(3);
  tasksStillToBeDone.offer(2);
  tasksStillToBeDone.offer(5);
  tasksStillToBeDone.offer(1);


  while (!tasksStillToBeDone.isEmpty()) {
      if (tasksStillToBeDone.peek().equals(1)) {
          tasksStillToBeDone.poll();
      } else {
          Integer oldValue = tasksStillToBeDone.poll();
          tasksStillToBeDone.offer(oldValue -1);
      }
  }
    }
}
