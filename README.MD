# Elastic Data Ingest with AWS Lambda

A Lambda Function to  ingest the incremental data to elastic search . The lambda Function invoked by database triggers such as. insert, update and delete.

## Getting Started
### Environment Varible

The environment varible to pass in lambda function

```
DATABASE_HOST
```
```
DATABASE_NAME
```
```
DATABASE_PASSWORD
```
```
DATABASE_PORT
```
```
DATABASE_USER
```
```
ELASTICSEARCH_HOST
```
```
ELASTICSEARCH_PORT
```
### Terraform will Create a Role for Lambda Function

```
default ="LambdaRole-ES"
```
<b> The role have following policy attach to it:</b> 

```
sns, cloudwatch, kms, LambdaVpcAccess
```
### Running Terraform
Apply Terraform

```
AWS_PROFILE=default terraform apply
```

Destroy Terraform

```
AWS_PROFILE=default terraform destroy
```
<b>default:</b> The default aws profile
## Built With

* [Terraform](https://www.terraform.io/) - The IaC used
* [Python](https://www.python.org/) - python2.7
* [AWS_Lambda](https://aws.amazon.com/lambda/) - Serverless computing platform

