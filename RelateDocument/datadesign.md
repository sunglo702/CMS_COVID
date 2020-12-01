数据库表设计

#### tbl_user

user

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

```
rol_id
rol_type(用户类型)
rol_user(用户)
```

#### tbl_information

user upload information 

```
inf_id
inf_user(提交信息的用户)
inf_content(信息的内容文本)
inf_date(提交信息时间)
inf_virus(是否患上病毒)
```

#### tbl_report

```
rep_id
rep_user(举报的用户)
rep_pos(举报地点)
rep_infor(举报信息)
```

#### tbl_state

statement about our country or international country

​	have not connection of any other table

```
sta_xxxx

```

#### tbl_news

some news about COVID 

have not connection of any other table

```
new_xxx
```

