var string1 = document.getElementById("hiddenText").innerHTML;

 var searchedText = document.getElementById("searchedText").innerText;
 
 const regex1 = RegExp(searchedText, 'ig');
 const str1 = string1;
 let array1;
 
 let counter = 0;
 
 while ((array1 = regex1.exec(str1)) !== null) {
 
     counter++;
   
 }
 
document.getElementById("coincidences").innerText = " " +  counter + " ";
document.getElementById("hiddenText").innerHTML = "";
document.getElementById("hiddenText").innerText = "";
