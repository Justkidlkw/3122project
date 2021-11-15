package com.microservice.apiservice.entity.Log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Log {

    private Settings settings = new Settings();

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class Settings {

        private Index index = new Index();

    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class Index {
        private String number_of_shards = "2";
        private String number_of_replicas = "0";
    }
}

