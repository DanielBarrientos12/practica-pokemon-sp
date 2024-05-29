-- Table: pokemon.tipo_pokemon
CREATE TABLE tipo_pokemon (
    id SERIAL PRIMARY KEY,
    descripcion VARCHAR(100) NOT NULL,
    uuid VARCHAR(100) NOT NULL
);

-- Table: pokemon.pokemon
CREATE TABLE pokemon (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT NOT NULL,
    tipo_pokemon INTEGER REFERENCES tipo_pokemon(id),
    fecha_descubrimiento DATE NOT NULL,
    generacion INTEGER NOT NULL,
    uuid VARCHAR(100) NOT NULL
);

-- Table: pokemon.pueblo
CREATE TABLE pueblo (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    uuid VARCHAR(100) NOT NULL
);

-- Table: pokemon.entrenador
CREATE TABLE entrenador (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    fecha_vinculacion DATE NOT NULL,
    pueblo_id INTEGER REFERENCES pueblo(id),
    uuid VARCHAR(100) NOT NULL
);

-- Table: pokemon.captura
CREATE TABLE captura (
    pokemon_id INTEGER REFERENCES pokemon(id),
    entrenador_id INTEGER REFERENCES entrenador(id),
    PRIMARY KEY (pokemon_id, entrenador_id)
);
