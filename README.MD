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

<b>threshold:</b> is in days you want notification <br>
<b>topicname:</b> should be the sns topic name

### Terraform will Create a Role for Lambda Function

```
default ="LambdaRole-ES"
```
<b> email:</b> of subscriber to get notification of ssl expiration<br>
<b> domainname:</b> to check ssl expiry of a domain

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

