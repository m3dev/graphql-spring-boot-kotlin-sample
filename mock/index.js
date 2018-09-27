const express = require('express');
const bodyParser = require('body-parser');
const { graphqlExpress, graphiqlExpress } = require('apollo-server-express');
const { addMockFunctionsToSchema, makeExecutableSchema } = require('graphql-tools');

// const typeDefs = require('./type_defs');
const typeDefs = `
  type Query { books: [Book] }
  type Book { title: String, author: String, price: Int }
`;
const schema = makeExecutableSchema({ typeDefs });
// const mocks = require('./mocks')
addMockFunctionsToSchema({ schema });

const app = express();
app.use('/graphql', bodyParser.json(), graphqlExpress({ schema }));
app.use("/graphiql", graphiqlExpress({ endpointURL: "/graphql" }));
app.listen(3000, () => {
  console.log('/graphiql is running');
});
