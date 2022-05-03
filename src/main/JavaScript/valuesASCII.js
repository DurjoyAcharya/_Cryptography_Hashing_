function PrintASCIIvalues() {
    console.log("==============ASCII VALUES==============")
    Array.from(Array(127).keys()).slice(32).map(e=>{
       // console.log(String.fromCharCode(e));
        console.log(e);
    });
}
PrintASCIIvalues();
