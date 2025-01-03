## build
```
gradle build
```

## test
```
gradle test -i
```

## run
```
gradle run
```

# Docker

## docker build
```
docker build -t mabey/sandbox:1.0 .
```

## docker run
```
docker run -d mabey/sandbox:1.0
docker ps
docker exec -it <name> bash
```
#### docker interactive
```
docker run -it --entrypoint /bin/bash mabey/sandbox:1.0
```