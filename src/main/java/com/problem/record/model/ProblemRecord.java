package com.problem.record.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-18 16:52
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class ProblemRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String problemCategory;

    private String problemName;

    private String difficulty;

    private Integer tryTimes;

    private Integer successTimes;

    private Date createTime;

    private Date updateTime;

    private String remark;

}