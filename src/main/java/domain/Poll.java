package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "poll")
public class Poll {

	@Id
	@Column(name = "id", nullable = false, updatable = false)
	@NotNull
	@Size(max = 64)
	private String id;

	@Column(name = "password", nullable = false)
	@NotNull
	@Size(max = 500)
	private String poolQuestion;

	public String getPoolQuestion() {
		return poolQuestion;
	}

	public void setPoolQuestion(String poolQuestion) {
		this.poolQuestion = poolQuestion;
	}

}
