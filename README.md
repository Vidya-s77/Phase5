# Phase5-CI-CD
CI/CD Deployment for Springboot Application:<br/>
 Technologies involved<br/>
   1	Spring Boot Application in Java (RestFul Service in Spring Container)<br/>
   2	Maven (Build)<br/>
   3	Github (Code Repository)<br/>
   4	AWS S3 (To store artifacts eg. .jar files)<br/>
   5	AWS EC2Instance<br/>
   6	Representing visually what we are doing here.
![Block Diagram](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/BlockDiagram.PNG)
 
Step 1:<br/>
Create a simple spring boot application in IDE, eclipse or you can check out the code committed here.  
After Step 1:  
•	Perform maven clean build  
•	Run the spring boot application   
•	Create JAR File Using Final Name and command mvn clean install  
![In pom.xml](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/AddFinalNameInPlugins.PNG)
 ![Command to create JAR file](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/CreateJARFile.PNG)
 
•	JAR File Created  
 ![JAR file created](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/JARFileCreated.PNG)
•	output should be below  
 ![After Running Springboot](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/SprinbootOutput.PNG)
Step 2:  
•	Login to your AWS account  
![AWS Front Page](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/AWS.PNG)
•	Create an instance  
 

Select Amazon Linux AMI :
![Amazon Linux](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/CreateInstance.PNG)

Instance Created  
 ![Instance Created](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/EC2InstanceCreated.PNG)
Download Security Key:  
  ![.pem Downloaded](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/DownloadSecurityFile.PNG)
Use PuttyGen to Decode the security file:  
![PuttyGen](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/UsePuttyGentodecodethesecurityfile.PNG) 
After this step Using Putty Launch the Amazon Linux:  
 ![Amazon Linux Launched](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/EC2InstanceLaunched.PNG)
Install JDK 1.8 in the Amazon Linux 2 Instance:  
  ![Install JDK 1.8](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/installjdk1.8.PNG)
Create an S3 Bucket in AWS to add the JAR file and make that file public:  
   ![S3 Bucket](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/CreateS3Bucket.PNG)
  ![Upload JAR](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/UploadJARFileInTheBucket.PNG)
Copy URL and make it Public:  
 ![Copy URL And Make Public](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/CopyURLAndMakePublic.PNG)
Add the JAR file in the created amazon linux instance using the link copied from S3 Bucket:  
   ![AddJARFileInTheInstanceCreated](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/AddJARFileInTheInstanceCreated.PNG)
Run the JAR file using the command java -jar JARname.jar:  
 ![RunTheJARFile](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/RunTheJARFile.png) 

Copy the Public DNS from the instance created:  
 ![CopyPublic DNS](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/CopyPublicDNS.PNG)
Whenever you run this http://ec2-35-175-222-161.compute-1.amazonaws.com:8080/ you will get this output:
 ![Output](https://github.com/Vidya-s77/Phase5-CI-CD/blob/master/Images/Output.PNG) 

