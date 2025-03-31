CREATE TABLE Books (
    idLlibre SERIAL PRIMARY KEY,  
    titol VARCHAR(255) NOT NULL,  
    autor VARCHAR(255) NOT NULL,  
    editorial VARCHAR(255),       
    datapublicacio DATETIME,         
    tematica VARCHAR(100)        
);
