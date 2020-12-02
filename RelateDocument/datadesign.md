数据库表设计

#### tbl_user

user 用户

```
usr_id
usr_address(用户的地址)
usr_regtime(用户注册时间 )
usr_name(用户登陆名)
usr_passwd(用户登陆密码)
usr_phone(用户手机号)
usr_ident(用户身份证号)
usr_code (用户编码)
```

#### tbl_supplies

food or mask supplies or money（物资，食物，口罩，或者钱）

```
sup_id
sup_name (物资名)
sup_fromwhere(物资来源)
sup_towhere(物资目的地)
```

#### tbl_transport

transport about supply

物流

```
tra_id
tra_supplies(物资的物流)
tra_now(物资目前在哪)
tra_next(物资接下来要去哪)
tra_contact(物资配送联系方式)
tra_date(当前运输时间)
```

#### tbl_access

access in or access out 

进出

```
acc_id
acc_user (进出用户)
acc_type (进出类型， 进还是出)
acc_date (进出时间)
acc_frowhe(从哪来的)
acc_towhe(到哪去)
```

#### tbl_role

user role, admin  or normal user or volunteer 

角色分类

```
rol_id
rol_type(用户类型)
rol_user(用户)
```

#### tbl_information

user upload information /用户上报 信息

```
inf_id
inf_user(提交信息的用户)
inf_content(信息的内容文本)
inf_date(提交信息时间)
inf_virus(是否患上病毒)
```

#### tbl_report

举报

```
rep_id
rep_user(举报的用户)
rep_pos(举报地点)
rep_infor(举报信息)
```

#### tbl_community

社区

```
com_id
com_name（社区名）
com_admin（社区负责人）
com_address（社区地址）
```

#### tbl_approve

审批

```
app_id
app_date(记录申请时间)
app_user(审批居民)
app_comname(审批居民社区名)
app_outtime(出行时间)
app_backtime(返回时间)
app_outtype(外出类型,飞机，汽车等)
app_destination(外出目的地)
app_stat(审批状态)
app_effect(审批是否有效，是否过期)
app_adminnum(管理员编号)
app_adminname(管理员姓名)
```



#### tbl_state

statement about our country or international country

​	have not connection of any other table

可视化地图信息

```
sta_xxxx

```

#### tbl_news

some news about COVID 

have not connection of any other table

新闻

```
new_xxx
```

​	

​	