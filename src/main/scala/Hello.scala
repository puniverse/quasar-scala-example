import co.paralleluniverse.fibers.{Suspendable, Fiber}
import co.paralleluniverse.strands.SuspendableRunnable

object Hello {
  def main(args: Array[String]) {
    new Fiber[Void](new SuspendableRunnable() {
      override def run() {
        for (i <- 0 until 10) {
          println("good night"+i);
          Fiber.sleep(100);
        }
//        var i=0;
//        while(i<10) {
//          println("morning"+i);
//          i+=1
//          Fiber.sleep(100);
//        }
      }
    }).start().join()
  }
}
