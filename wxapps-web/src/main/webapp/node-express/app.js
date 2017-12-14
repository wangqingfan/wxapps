var express = require('express');
var bodyParser = require('body-parser');
var path = require('path');
var app = express();
app.use(express.static(path.join(__dirname, 'public')));
// url 统一资源调配符 encoded 编码 
app.use(bodyParser.urlencoded({extended:false}));

app.listen('8080',function(){
    console.log('服务器启动中');
});

//测试接口

app.post('/login',function(req,res){
    res.send(require('./mork/test.json'));
});