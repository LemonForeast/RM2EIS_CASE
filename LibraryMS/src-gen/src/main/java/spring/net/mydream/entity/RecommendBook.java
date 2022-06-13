package spring.net.mydream.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.FetchType;
import java.util.ArrayList;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import java.util.Date;
import java.util.List;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;

@Entity
			public class RecommendBook extends Book  implements BaseEntity {
	
	/* all primary attributes */
	private Date recommendDate;
	public Date getRecommendDate() {
		return recommendDate;
	}
	public void setRecommendDate(Date RecommendDate) {
		this.recommendDate = RecommendDate;
	}	
		
	@Id  // ����
	@GeneratedValue(strategy=GenerationType.IDENTITY) // ����������
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
				
	
		@ManyToOne(targetEntity=User.class)
		@JoinColumn(name="recommenduser_id",referencedColumnName="id")
		private User recommendUser;
				
		public User getRecommendUser() {
			return recommendUser;
		}
				
		public void setRecommendUser(User RecommendUser) {
			this.recommendUser = RecommendUser;
		}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecommendBook other = (RecommendBook) obj;
		if (!this.getId().equals(other.getId()))
			return false;
		else
			return true;
	}

}
