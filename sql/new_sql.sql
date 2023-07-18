use `ry-vue`;
-- ----------------------------
-- 1、存储每一个已配置的 DISK_MAP_BLOCK 的详细信息
-- ----------------------------
create table if not exists DISK_MAP_BLOCK
(
    id          bigint(20) primary key comment '编码',
    picture     varchar(120)                       not null comment '图纸',
    name        varchar(200)                       not null comment '名称',
    nation_name varchar(200)                       not null comment '国际名称',
    description varchar(250)                       not null comment '描述',
    create_time datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete   tinyint  default 0                 not null comment '是否删除'
) engine = innodb comment = '任务详细信息表';

INSERT INTO DISK_MAP_BLOCK (id, picture, name, nation_name, description, create_time, update_time, is_delete)
VALUES (1, 'http://example.com/image_1.jpg', 'Project Alpha', 'International Name for Project Alpha',
        'This is a description for Project Alpha.', '2022-10-02 23:43:11', '2023-01-26 19:58:41', 1),
       (2, 'http://example.com/image_2.jpg', 'Project Beta', 'International Name for Project Beta',
        'This is a description for Project Beta.', '2022-10-22 05:33:38', '2023-05-10 17:44:05', 1),
       (3, 'http://example.com/image_3.jpg', 'Project Gamma', 'International Name for Project Gamma',
        'This is a description for Project Gamma.', '2022-11-26 14:29:52', '2023-06-24 13:32:31', 0),
       (4, 'http://example.com/image_4.jpg', 'Project Delta', 'International Name for Project Delta',
        'This is a description for Project Delta.', '2023-04-15 07:42:02', '2023-05-22 16:43:55', 0),
       (5, 'http://example.com/image_5.jpg', 'Project Epsilon', 'International Name for Project Epsilon',
        'This is a description for Project Epsilon.', '2022-10-09 10:13:26', '2023-01-20 12:11:49', 1),
       (6, 'http://example.com/image_6.jpg', 'Project Zeta', 'International Name for Project Zeta',
        'This is a description for Project Zeta.', '2023-05-14 19:58:49', '2023-06-20 02:42:20', 0),
       (7, 'http://example.com/image_7.jpg', 'Project Eta', 'International Name for Project Eta',
        'This is a description for Project Eta.', '2022-07-28 16:16:22', '2023-04-10 21:03:50', 1),
       (8, 'http://example.com/image_8.jpg', 'Project Theta', 'International Name for Project Theta',
        'This is a description for Project Theta.', '2023-06-01 03:57:38', '2023-07-02 20:32:47', 0),
       (9, 'http://example.com/image_9.jpg', 'Project Iota', 'International Name for Project Iota',
        'This is a description for Project Iota.', '2022-11-15 17:37:43', '2023-04-13 23:02:29', 0),
       (10, 'http://example.com/image_10.jpg', 'Project Kappa', 'International Name for Project Kappa',
        'This is a description for Project Kappa.', '2023-06-20 10:52:36', '2023-07-02 07:18:05', 0);


-- ----------------------------