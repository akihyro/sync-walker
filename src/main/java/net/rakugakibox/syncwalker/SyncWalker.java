package net.rakugakibox.syncwalker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.NonNull;

/**
 * SyncWalker.
 */
@SpringBootApplication
public class SyncWalker {

    /**
     * アプリケーションのエントリポイント。
     *
     * @param args パラメータ。
     */
    public static void main(@NonNull String[] args) {
        SpringApplication app = new SpringApplication(SyncWalker.class);
        ApplicationContext ctx = app.run(args);
        System.exit(SpringApplication.exit(ctx));
    }

}
