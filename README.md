# MongoDB

## Start Up
#### data path
- MongoDB's default data path is `\data\db`.
- Make directory befor startup or specify the path.

  > `md \data\db`  
  > or  
  > `<mongo path>\bin\mongod.exe --dbpath "D:\data\mongo\db"`
  >

- Or specify the dbpath in a configuration file.

#### start up
- run `mongod.exe`
- until `waiting for connections on port 27017`

#### import data
- import data from a json file

  > `mongoimport --db <XXX> --collection <XXX> --drop --file <XXX.json>`
  >

## Shell




## Java Driver

