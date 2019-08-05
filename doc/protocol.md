# 消息格式

## 上行
#### Restful
- Action
  - 消息名字，e.g. login, logout
- Params
  - `每个消息的自定义字段
- ReqToken
  - 请求token
- Timestamp
  - 时间戳，取当前值
- DevID
  - 客户设备id, 可用来处理多段登入
- SN
  - 请求序列号，可用来处理请求重放

####  算法
- SessionToken=random uuid， 后端在login时分配
- ReqToken=md5(Action + Params + SessionToken + Timestamp + DevID + SN)
#### example

http://localhost:8080/login?Params={"phone":123,"checkCode":2387}&ReqToken=ABEF&Timestamp=123488&DevID=1234242&SN=1234

#### NOTICE:
- login时不校验ReqToken

## 下行
response中为json格式的回复正文

- Result, 错误码，类型为int32
- Data, 具体的回复内容

