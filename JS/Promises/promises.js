let resultData=new Promise(function(resolve,reject){
    if(10===10){
        reject('failed');
    }
    else{
        resolve('success');
    }
});
resultData.then((data)=>{
    console.log('then block='+data);
}).catch((error)=>{
    console.log('catch block='+error);
});




let employeeData=new Promise(function(resolve,reject){
    const employee=[
        {
            name:'shahrukh',
            age:60
        },
        {
            name:'deepa',
            age:48
        },
        {
            name:'shahana',
            age:56
        }

    ];
    if(10>10){
        reject('failed');
    }
    else{
        resolve(employee);
    }
});
employeeData.then((data)=>{
    //console.log('employee data=',data);
    return data;
}).catch((error)=>{
    console.log('catch block='+error);
}).then(function(data1){
    console.log('this is then block2',data1);
})