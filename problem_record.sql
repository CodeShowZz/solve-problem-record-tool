CREATE TABLE `problem_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `problem_category` varchar(100) NOT NULL DEFAULT '' COMMENT '问题分类',
  `problem_name` varchar(100) NOT NULL DEFAULT '' COMMENT '问题名称',
  `difficulty` varchar(30) NOT NULL DEFAULT '' COMMENT '难度 简单/中等/困难',
  `try_times` int(11) NOT NULL DEFAULT '0' COMMENT '尝试次数',
  `success_times` int(11) NOT NULL DEFAULT '0' COMMENT '成功次数',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `remark` varchar(255) DEFAULT '' COMMENT '备注',
  `importance` varchar(255) DEFAULT '' COMMENT '了解,理解,掌握',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=utf8mb4;

