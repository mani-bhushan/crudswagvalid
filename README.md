# Spring Boot H2 Database CRUD example: 
Building Rest API with Spring Data JPA 
microservices with swagger and validations

## Swagger UI- OpenAPI documentation:
http://localhost:8082/swagger-ui/index.html

## GIT
<ul>
<li>git init</li>
<li>git add README.md</li>
<li>git status</li>
<li>git reset</li>
</ul>

## Docker
<ul>
<li>docker ps</li>
<li>docker build -t crudswagvalid .</li>
<li>docker images</li>
</ul>

## Kubectl
uses deployment.yaml"\
"admin/dev.yaml
<ul>
<li>kubectl cluster-info</li>
<li>kubectl get nodes</li>
<li>kubectl get pods</li>
<li>kubectl get pods --namespace dev</li>
<li>kubectl apply -f deployment.yaml</li>
<li>kubectl config current-context</li>
<li>kubectl apply -f deployment.yaml</li>
<li>kubectl get namespaces</li>
<li>kubectl create -f admin/namespace-dev.yaml</li>
<li>kubectl create -f admin/namespace-prod.yaml</li>
<li>kubectl describe pod crudswagvalid-dfb5db989-dmq2z --namespace dev</li>
</ul>