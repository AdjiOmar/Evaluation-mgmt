package com.niit.evaluation_mgmt;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.niit.evaluation_mgmt.repository.EvaluationRepository;
// import com.niit.evaluation_mgmt.repository.ModuleRepository;
// import com.niit.evaluation_mgmt.model.Evaluation;
// import com.niit.evaluation_mgmt.model.Module;
// import com.niit.evaluation_mgmt.model.Question;

@SpringBootApplication
public class EvaluationMgmtApplication {
// implements CommandLineRunner {

	// @Autowired
	// ModuleRepository mRepo;

	// @Autowired
	// EvaluationRepository eRepo;

	public static void main(String[] args) {
		SpringApplication.run(EvaluationMgmtApplication.class, args);

	}
}
	// @Override
	// public void run(String... args) throws Exception {
		//TODO Auto-generated method stub
		// Module module = new Module();
		// module.setNom("UML");
		// module.setVolumehoraire(30);
		// module.setEvaluations(List.of(
		// 		new Evaluation(null, "Eval1", "null", null, 0, null, List.of(
		// 				new Question(null, "qwertty", "tyu", "jhg", "lop", "mnb", "mnb")), null, module, null)));

		// mRepo.save(module);

		// module = new Module();
		// module.setNom("XML");
		// module.setVolumehoraire(30);
		// module.setEvaluations(List.of(
		// 		new Evaluation(null, "Eval2", "null", null, 0, null, List.of(
		// 				new Question(null, "azerty", "asdf", "mnbv", "waqd", "uyqa", "asdf")), null, module, null)));

		// mRepo.save(module);
	//}

//}
