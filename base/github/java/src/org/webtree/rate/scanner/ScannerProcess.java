package org.webtree.rate.scanner;

import com.google.common.collect.Lists;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.webtree.rate.scanner.utils.Scanner;

import java.util.List;

/**
 * @author Maxim
 * @date $ {DATE}.
 */
public class ScannerProcess implements Runnable {
    private boolean run = true;
    private static final ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});

    @Override
    public void run() {
        while (run) {
            for (Scanner scanner : getScanners()) {
                new Thread(scanner).start();
            }
            run = false;
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ignored) {}
        }
    }

    public void stop() {
        run = false;
    }

    public List<Scanner> getScanners() {
        return Lists.newArrayList(
                context.getBean(Scanner.class)
        );
    }

    public static void main(String[] args) {
        new Thread(new ScannerProcess()).start();
    }
}
