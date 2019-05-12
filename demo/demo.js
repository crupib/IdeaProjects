var _ = require('lodash')
//console.log(_.random(1,100))
var fs = require('fs')
//var data = require('./data.json')
//console.log(data.name)
//fs.readFile('./data.json','utf-8', (err,data) => {
//    var data = JSON.parse(data)
//    console.log(data.name)
//})
//fs.readdir('/Users/williamcrupi/IdeaProjects', (err,data1) => {
//    console.log(data1)
//}
//)
var data = {
    name: 'Bob'
}
fs.writeFile('data2.json',JSON.stringify(data), (err) =>{
    console.log('write finished',err)
})

