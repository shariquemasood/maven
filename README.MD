# Insert Trigger and Procedure

Procedure to call Lambda funtion when of the Trigger event insert, update and delete occure. 

## Getting Started
### Adding Trigger and Procedure

login to mysql console select a database

```
mysql>source ProcedureTrigger.sql;
```

### The RDS need a Role to call Lambda Function The Role have following Policy Attach to it

```
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Sid": "VisualEditor0",
            "Effect": "Allow",
            "Action": "lambda:InvokeFunction",
            "Resource": "<arn of lambda function>"
        }
    ]
}
```
### Attaching Role to RDS
Add the created role in Cluster level Parameter Group
```
aws_default_lambda_role   <arn of IAM role>
```
### Also add the Role in 
```
Manage IAM roles
```
Check <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.IAM.AddRoleToDBCluster.html">Associating an IAM Role with an Amazon Aurora MySQL DB Cluster</a> For More.

### Reboot the RDS
## Built With

* [MySql](https://dev.mysql.com/doc/) - MySql
* [Python](https://www.python.org/) - python3.6
* [AWS_Lambda](https://aws.amazon.com/lambda/) - Serverless computing platform

