import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

//create a todo list
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Todo List'),
        ),
        body: ListView(
          children: const <Widget>[
            ListTile(
              title: Text('Task 1'),
              trailing: Icon(Icons.check_box),
            ),
            ListTile(
              title: Text('Task 2'),
              trailing: Icon(Icons.check_box),
            ),
            ListTile(
              title: Text('Task 3'),
              trailing: Icon(Icons.check_box),
            ),
          ],
        ),
      ),
    );
  }
  // @override
  // Widget build(BuildContext context) {
  //   return const MaterialApp(
  //     home: Scaffold(
  //       body: Center(
  //         child: Text('Hello World!'),
  //       ),
  //     ),
  //   );
  // }
}
