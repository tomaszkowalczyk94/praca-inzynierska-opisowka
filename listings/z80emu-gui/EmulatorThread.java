public class EmulatorThread extends Thread {
    
    ...
    
    private Object lock = new Object();
    boolean pause = false;

    public void pause() {
        pause = true;
    }

    public void unPause() {
        synchronized(lock) {
            lock.notify();
        }

    }

    private void pauseEmulationIfPausedFlag() throws InterruptedException {
        synchronized(lock) {
            if(pause) {
                lock.wait();
                pause = false;
            }
        }
    }

    @Override
    public void run() {
        try {
            pause = true;
            while (true) {
                pauseEmulationIfPausedFlag();
                makeInterruptsRequests();
                z80.runOneInstruction();
                refreshGui();
            }
        } catch (Exception e) {
            dialogHelper.displayError("emulation error", e);
            debuggerController.refreshCyclicButtonText();
        }
    }
    
    ...
}
