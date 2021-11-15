# 3122project

# Compile the code
```
cd project
docker-compose up

note that the project is implemented in mac environment,some code need to be changed if run under windows
Changes:
prometheus.yml

  - job_name: 'spring-actuator'
    metrics_path: '/actuator/prometheus'
    scrape_interval: 5s
    static_configs:
      - targets: ['docker.for.mac.localhost:9001']
      
Here targets need to be changed
      - targets: ['localhost:9001']
      
```

# Grafana
```
curl localhost:3000
username: COMP3122
password: group7
```

#API
```
Download and install Postman
https://www.postman.com

import all json file under folder postman

Edit the json file and press the "Send" button to send HTTP request
```

# UnitTesting
```
mvn test
```

# Stop all container
```
docker-compose down -v
```
