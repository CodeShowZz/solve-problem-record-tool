package com.problem.record;

import com.problem.record.mapper.ProblemRecordRepository;
import com.problem.record.model.ProblemRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.datetime.DateFormatter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;
import java.util.Locale;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-18 15:59
 */
@SpringBootApplication
public class MybatisDemoApplication implements CommandLineRunner {

    @Autowired
    private ProblemRecordRepository problemRecordRepository;

    public static void main(String[] args) {
        SpringApplication.run(MybatisDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        FileReader fileReader = new FileReader("C:\\Users\\yeahka\\Desktop\\leetcode.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        DateFormatter dateFormatter = new DateFormatter("yyyy-MM-dd");
        while ((line = bufferedReader.readLine()) != null) {
            String[] splits = line.split("\\s+");
            String problemCategory = "leetcode";
            String problemName = splits[0];
            String difficulty = splits[1];
            String [] tryAndSuccessTime = splits[2].split("/");
            String successTime = tryAndSuccessTime[0];
            String tryTime = tryAndSuccessTime[1];
            Date lastTime = dateFormatter.parse(splits[3], Locale.CHINA);
            ProblemRecord problemRecord = ProblemRecord.builder()
                    .problemCategory(problemCategory)
                    .problemName(problemName)
                    .difficulty(difficulty)
                    .successTimes(Integer.parseInt(successTime))
                    .tryTimes(Integer.parseInt(tryTime))
                    .updateTime(lastTime)
                    .build();
            problemRecordRepository.save(problemRecord);

        }

    }
}