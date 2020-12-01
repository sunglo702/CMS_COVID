数据库表设计

#### tbl_user

user

```
usr_id
usr_address(user address)
usr_regtime(registe time)
usr_name(username to login)
usr_passwd(user password to login)
usr_phone(user phone nummber)
usr_ident(user identycard)
usr_code (user compile code such as 2220171338 22means user type 2017 means date 1338 means 1338th. user)
```

#### tbl_supplies

food or mask supplies or money

```
sup_id
sup_name (supply name)
sup_fromwhere(who supply this food or mask)
sup_towhere(supply will to where)
sup_code()
```

#### tbl_transport

transport about supply

```
tra_id
tra_supplies(transportation about supplies)
tra_now(supplies now are where)
tra_next(supplies will to where)
tra_contact(contact about this transport)
tra_date(transport information about date)
tra_code()
```

#### tbl_access

access in or access out 

```
acc_id
acc_user (user)
acc_type (access type in or outs)
acc_date (access date)
acc_frowhe(access from)
acc_towhe(access aming)
```

#### tbl_role

user role, admin  or normal user or volunteer 

```
rol_id
rol_type(role type,admin or normal user)
rol_user(user)
```

#### tbl_information

user upload information 

```
inf_id
inf_user(information user)
inf_content(information content)
inf_date(information time)
inf_virus(information about virus or not)
inf_code (maybe useful)
```

#### tbl_report

```
rep_id
rep_user(user)
rep_pos(user report some position)
rep_infor(report information)
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

