<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <input type="radio" name="gender" value="=ชาย" onchange="changeGender()">ชาย
    <input type="radio" name="gender" value="=หญิง" onchange="changeGender()">หญิง
    <input type="radio" name="gender" value="=อื่นๆ" onchange="changeGender()">อื่นๆ
    <script>
    function changeGender() {
        let genderInputs = document.querySelectorAll('input[name=gender]');

        for (let i =0 ; i <genderInputs.length; i++) {
            if(genderInputs[i].checked){
        console.log(genderInputs[i].value);
            }
        }    
    }    
    
    </script>
</body>
</html>